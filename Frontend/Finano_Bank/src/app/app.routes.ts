import {  RouterModule,Routes } from '@angular/router';
import { Loginaccount } from './loginaccount/loginaccount';
import { Createaccount } from './createaccount/createaccount';
import { Loginpage } from './loginpage/loginpage';

export const routes: Routes = [
    {path:'login',component:Loginaccount},
    {path:'register',component:Createaccount},
    {path:'',component:Loginpage}
];
