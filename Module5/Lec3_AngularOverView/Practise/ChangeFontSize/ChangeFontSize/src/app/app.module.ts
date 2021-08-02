import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { FontEditorComponent } from './font-editor/font-editor.component';
import { SizeEditorComponent } from './size-editor/size-editor.component';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,

    SizeEditorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
