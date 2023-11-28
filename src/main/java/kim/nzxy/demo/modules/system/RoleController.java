package kim.nzxy.demo.modules.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ly-chn
 */
@RestController
@RequestMapping("role")
public class RoleController {
    @GetMapping("create")
    public void create() {
    }
    @GetMapping("search")
    public void search() {
    }
}
