import {  RouterModule,Routes } from '@angular/router';
import { Loginaccount } from './loginaccount/loginaccount';
import { Createaccount } from './createaccount/createaccount';

export const routes: Routes = [
    {path:'login',component:Loginaccount},
    {path:'register',component:Createaccount},
    
];
