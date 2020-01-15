import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DataService } from '../data.service';
@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

books = { "name":"", "author":"","subject":"", "price":"","isbn":""}

  constructor(private route:ActivatedRoute, private router:Router,private service: DataService) 
  { }

  ngOnInit() {
  }

  Insert()
  {
    console.log(this.books);
    let observableaResult= this.service.InsertBook(this.books);

    observableaResult.subscribe((result)=>
    {
      console.log(result);
      this.router.navigate(['/addBook']);
    })
  }


}
