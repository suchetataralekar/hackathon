import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  constructor(private service: DataService) { }
user : any;
  ngOnInit() {

    var observableResult= this.service.SelectUsers();

    observableResult.subscribe((result)=>
    {
      console.log(result);
      this.user=result;
    });
  }

  


}
