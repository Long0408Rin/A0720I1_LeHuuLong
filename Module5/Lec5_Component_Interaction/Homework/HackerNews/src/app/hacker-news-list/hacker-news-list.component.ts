import {Component, Input, OnInit} from '@angular/core';
import {IModels} from '../hacker-news-model/IModels';

@Component({
  selector: 'app-hacker-news-list',
  templateUrl: './hacker-news-list.component.html',
  styleUrls: ['./hacker-news-list.component.scss']
})
export class HackerNewsListComponent implements OnInit {
  @Input()
  models: IModels[];
  constructor() { }

  ngOnInit(): void {
  }
  updateModels(newModels: IModels){
    for (let model of this.models){
      if (model.id === newModels.id) {
        model = newModels;
      }
    }
  }

}
