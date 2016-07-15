package mx.com.chilitech.elastic.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.searchbox.client.config.*;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.client.http.JestHttpClient;
import mx.com.chilitech.elastic.model.Book;
import mx.com.chilitech.elastic.model.Publisher;

public class Main {

	public static void main(String[] args) {
		String server = "http://localhost:9200";
		
		Publisher pub = new Publisher();
		pub.setCountry("MEX");
		pub.setName("Santillana");
		
		Book book = new Book();
		book.setTitle("Titulo de prueba");
		book.setPublisher(pub);
		book.setAuthors(Arrays.asList("Greg L. Turnquist"));
		
		//Native Client
		ObjectMapper mapper = new ObjectMapper();
		String value = "";
		try {
			value = mapper.writeValueAsString(book);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Iniciar elasticSearch
		//Node node = nodeBuilder().clusterName("develop-chilitech").node();
		Client client = null;
		
		//Insert
		
		IndexResponse response = client.prepareIndex("ff", "book", "1")
				.setSource(value).execute().actionGet();
		
		/*IndexResponse response = client.prepareIndex("twitter", "tweet", "1")
		        .setSource(jsonBuilder()
		                    .startObject()
		                        .field("user", "kimchy")
		                        .field("postDate", new Date())
		                        .field("message", "trying out Elasticsearch")
		                    .endObject()
		                  )
		        .get();*/
		
		//get
		GetResponse getResponse = client.prepareGet("ff", "book", response.getId())
				.execute().actionGet();
		String source = getResponse.getSourceAsString();
		//Book persistedBook = mapper.readValue(source, Book.class);
		
		//Only show the result
		Map<String, Object> sourceAsMap = getResponse.getSourceAsMap();
		
		
		
		//Client JEST
		/*HttpClientConfig clientConfig = new HttpClientConfig.Builder(server)
				.multiThreaded(true).build();*/
		JestClientFactory factory = new JestClientFactory();
		factory.setHttpClientConfig(null);
		
		//JestClient client = factory.getObject();
	}
}
