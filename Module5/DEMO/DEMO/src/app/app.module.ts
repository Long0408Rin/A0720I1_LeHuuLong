import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {StudentListComponent} from './student-list/student-list.component';
import {StudentInformationComponent} from './student-information/student-information.component';
import { TemplateDrivenFormComponent } from './template-driven-form/template-driven-form.component';
import { ReactFormComponent } from './react-form/react-form.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    StudentInformationComponent,
    TemplateDrivenFormComponent,
    ReactFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
