package mx.com.chilitech.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= {ClassroomController.URL_MAPPING, "/"})
public class ClassroomController {

	public static final String URL_MAPPING = "/classroom";
	public static final String VIEW_NAME = "classroom";
	
	//public static final Logger logger = Logger.getLogger(ClassroomController.class);
	
	//private ClassRoomService classroomService;
	
	//@Autowired
	//public ClassroomController(ClassroomService classroomService){
	//	this.classroomService = classroomService;
	//}
	
	@RequestMapping(method = RequestMethod.GET)
	public String handleRequest(ModelMap model) throws Exception {
		return VIEW_NAME;
	}
	
	/*@RequestMapping(value="/classroom/{classroomId}", method = RequestMethod.GET)
	public String getClassroom(@PathVariable("classroomId") Long classroomId, ModelMap model) {
		model.addAttribute("classroom", classroomService.getClassroom(classroomId));
	}*/
	
	/*@RequestMapping(value="/classroom/{classroomId}/students", method = RequestMethod.GET)
	public String getStudentsForClassroom(@PathVariable("classroomId") Long classroomId, ModelMap model) {
		model.addAttribute("students", classroomService.getStudentsInClassroom(classroomId));
	}*/
	
}
