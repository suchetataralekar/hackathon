import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DataService } from '../data.service';
@Component({
  selector: 'app-add-member',
  templateUrl: './add-member.component.html',
  styleUrls: ['./add-member.component.css']
})
export class AddMemberComponent implements OnInit {

  user = {"name":"","email":"", "phone":"", "password":"", "role":""}
  constructor(private route:ActivatedRoute, private router:Router,private service: DataService)
  
  { }

  ngOnInit() {
  }

  Insert()
  {
    console.log(this.user);
    let observableaResult= this.service.InsertUser(this.user);

    observableaResult.subscribe((result)=>
    {
      console.log(result);
      this.router.navigate(['/addMember']);
    })
  }


}
