import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IModels} from '../hacker-news-model/IModels';

@Component({
  selector: 'app-like',
  templateUrl: './like.component.html',
  styleUrls: ['./like.component.scss']
})
export class LikeComponent implements OnInit {
  @Input()
  model: IModels[];
  @Output()
  likesOnChange: EventEmitter<IModels> = new EventEmitter<IModels>();
  constructor() { }

  ngOnInit(): void {
  }
  likeThis(){
    this.model.likes++;
    this.likesOnChange.emit(this.model);
  }

}
