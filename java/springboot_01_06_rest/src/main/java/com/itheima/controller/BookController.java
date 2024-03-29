package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: springboot_01_01_quickstart
 * @package: com.itheima.controller
 * @className: BookController
 * @NAME: WANG CHAO
 * @date: 2023/09/08 16:53
 */
@SuppressWarnings({"all"})
//Rest
@RestController
@RequestMapping("/books")
public class BookController {
     //@RequestMapping(method = RequestMethod.POST)
     @PostMapping
     public String save(@RequestBody Book book) {
          System.out.println("ubook save..." + book);
          return "{'module':'book save'}";
     }

     //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
     @DeleteMapping("/{id}")
     public String delete(@PathVariable Integer id) {
          System.out.println("book delete..." + id);
          return "{'module':'book delete'}";
     }

     //@RequestMapping(method = RequestMethod.PUT)
     @PutMapping
     public String update(@RequestBody Book book) {
          System.out.println("book update..." + book);
          return "{'module':'book update'}";
     }

     //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
     @GetMapping("/{id}")
     public String getById(@PathVariable Integer id) {
          System.out.println("book getById..." + id);
          return "{'module':'book getById'}";
     }

     //@RequestMapping(method = RequestMethod.GET)
     @GetMapping
     public String getAll() {
          System.out.println("book getAll...");
          return "{'module':'book getAll'}";
     }
}
