import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddMemberComponent } from './add-member/add-member.component';
import { AddBookComponent } from './add-book/add-book.component';
import { ListUserComponent } from './list-user/list-user.component';
import {NgModel, NgForm, FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { EditUserComponent } from './edit-user/edit-user.component';

@NgModule({
  declarations: [
    AppComponent,
    AddMemberComponent,
    AddBookComponent,
    ListUserComponent,
    MenuComponent,
    EditUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:"addBook", component : AddBookComponent} ,
      {path:"addMember", component : AddMemberComponent} ,
      {path:"listUser", component : ListUserComponent} ,
      {path:"editUser/:id", component : EditUserComponent} ,
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
