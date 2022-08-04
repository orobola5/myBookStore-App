package com.example.mybookstore.controller;

import com.example.mybookstore.Service.BookService;

import com.example.mybookstore.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class BookController {

    private  final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/book")
    public String list(Model model){
        model.addAttribute("books",bookService.findAll());
        return "list";
    }

//    @GetMapping("/book")
//    public String getAllBooks(Model model){
//        model.addAttribute("books",bookService.findAll());
//        return "list";
//    }

    @GetMapping("/book/add")
    public String addBook(Model model){
        model.addAttribute("books",new Book());
        return "form";
    }

    @PostMapping("/book/save")
    public String saveBook(@Validated Book book, BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()) {
            return "form";
        }
        bookService.save(book);
        redirectAttributes.addFlashAttribute("successMessage","Saved book successfully");
        return "redirect:/book";
    }

    @SuppressWarnings("deprecation")
    @GetMapping("/book/search")
    public String searchBooks(@RequestParam("term") String term,Model model){
        if(StringUtils.isEmpty(term)){
            return "redirect:/book";
        }
        model.addAttribute("books",bookService.search(term));
        return "list";

    }
    @GetMapping("/book/{id}/edit")
    public String editBook(@PathVariable("id")Long id,Model model){
        model.addAttribute("book",bookService.findOne(id));
        return "form";
    }
@PostMapping("/book/{id}/delete")
    public String deleteBook(@PathVariable Long id,RedirectAttributes redirectAttributes){
        bookService.delete(id);
        redirectAttributes.addFlashAttribute("successMessage","deleted book successfully!");
        return "redirect:/book";
    }


}
