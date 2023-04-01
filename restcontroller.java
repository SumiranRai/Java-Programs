package classes;

import annotations.RestController;
import annotations.RequestMapping

@annotations.RestController
public class CustomController {
    @sort(strategy = TYPE.MERGE)
    List<Integer> list = {1, 5, 2, 3, 9, 0};

    public String field;

    @RequestMapping 
    public String method () {
        System.out.println("Sairam0");
        return "Sairam";
    }

    @RequestMapping(invoke = true, rituraj = "")
    public String method1 () {
        System.out.println("Sairam1");
        return "Sairam";
    }
}