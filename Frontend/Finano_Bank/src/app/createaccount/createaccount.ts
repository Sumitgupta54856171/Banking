import { Component } from '@angular/core';
import { Loginaccount } from '../loginaccount/loginaccount';
import { NgIf } from '@angular/common';
@Component({
  selector: 'app-createaccount',
  imports: [Loginaccount,NgIf],
  templateUrl: './createaccount.html',
  styleUrl: './createaccount.css'
})
export class Createaccount {
  
name:string="home"


}
