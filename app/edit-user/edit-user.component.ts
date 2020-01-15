import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DataService } from '../data.service';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {
  user = {"id":"", "name":"","email":"", "phone":"", "password":"", "role":""}
  constructor(private route:ActivatedRoute, private router:Router,private service: DataService) 
  { }

  ngOnInit() {
    this.route.paramMap.subscribe((result)=>
      {
        debugger;
      let No= result.get("id");
      console.log(No);
      let observableaResult= this.service.SelectByNo(No);

            observableaResult.subscribe((data)=>
            {                
                this.user=data[0];
                console.log( this.user);
            });
      });

  }


  Update()
  {
    console.log(this.user);
    let observableaResult= this.service.UpdateUser(this.user);

    observableaResult.subscribe((result)=>
    {
      console.log(result);
      this.router.navigate(['/editUser']);
    })
  }

}
