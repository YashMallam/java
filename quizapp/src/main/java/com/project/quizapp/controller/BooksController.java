package com.project.quizapp.controller;



@RestController
@RequestMapping("/books")
public class BooksController {
	
	MyRepo a;
		
		@GetMapping("{id}")
		public List<Books> getAllBooks(){
			
			return a.getAllBooks();
		}
		
		@PostMapping("/add")
		public String insertBook(@RequestBody Books books) {
			return a.insertBook(books);
			
		}
		
		@PutMapping("/update")
		public String updateBook(@RequestBody Books books):
	
	
	

}
