package jakedavison.project.rest.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class V1Controller {

    @GetMapping(value = "/path", produces = "application/json")
    public @ResponseBody Object getResponse() {
        return null;
    }
}
