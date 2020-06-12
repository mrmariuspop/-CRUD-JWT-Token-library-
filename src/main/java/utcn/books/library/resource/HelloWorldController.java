package utcn.books.library.resource;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @Autowired
    public HelloWorldController() {
    }

    @GetMapping
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", defaultValue = "Bearer ",
                    required = true, dataType = "string", paramType = "header") })
    public String printHello() {
        return "Hello World";
    }

}