package mx.com.chilitech.batch.hello;

import org.springframework.batch.item.ItemProcessor;

import mx.com.chilitech.batch.hello.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		return item;
	}

}