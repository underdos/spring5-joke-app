package kusnadi.springframework.joke.spring5jokeapp.controllers;


import kusnadi.springframework.joke.spring5jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model){
        model.addAttribute("jokes", jokeService.getJokes());

        return "chucknorris";
    }
}
