import { Injectable } from '@angular/core';
import { HttpClient } from  '@angular/common/http';






@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(public http: HttpClient) { }


  
  
  SelectByNo(id)
  {  
    debugger;
  return this.http.get("http://localhost:7070//test_boot/user/" +id)
  
  }
 
  UpdateUser(userobj)
  {
    return this.http.put("http://localhost:7070//test_boot/user/update/",userobj);
  }
  SignIn(userName,password)
  {
   return this.http.get("http://localhost:7070//test_boot/user/userName/"+userName+"/password/"+password);
  }


  SelectUsers()
  {
    return this.http.get("http://localhost:7070//test_boot/user/list");
  }
  
  
  InsertUser(userobj)
  {
    return this.http.post("http://localhost:7070//test_boot/user/add/",userobj);
  }
  

  InsertBook(bookobj)
  {
    return this.http.post("http://localhost:7070//test_boot/book/add/",bookobj);
  }
  

}