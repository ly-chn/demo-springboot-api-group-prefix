package kim.nzxy.demo.modules.article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ly-chn
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @GetMapping("create")
    public void create() {
    }
    @GetMapping("search")
    public void search() {
    }
}
