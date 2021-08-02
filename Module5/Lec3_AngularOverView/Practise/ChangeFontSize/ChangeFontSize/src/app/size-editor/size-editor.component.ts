import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-size-editor',
  templateUrl: './size-editor.component.html',
  styleUrls: ['./size-editor.component.css']
})
export class SizeEditorComponent implements OnInit {
  fontSize = 14;

  constructor() { }

  onChange(value){
    this.fontSize = value;
  }
  ngOnInit(): void {
  }

}
