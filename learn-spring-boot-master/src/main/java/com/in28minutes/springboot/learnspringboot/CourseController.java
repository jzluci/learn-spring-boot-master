package com.in28minutes.springboot.learnspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //when a request is made for a course or set of courses, return back course id, name, and author
    //map a url to the course controller class - /courses - do that with @RequestMapping()

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(new Course(1, "Learn AWS", "Albus Dumbledore"),
                             new Course(1, "Learn DevOps", "Gimli the Dwarf"),
                             new Course(3, "Learn Azure", "Gimli the Dwarffffff")

        );
    }

}
