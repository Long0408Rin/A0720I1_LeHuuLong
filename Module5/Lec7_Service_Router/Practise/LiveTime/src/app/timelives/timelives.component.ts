import { Component, OnInit } from '@angular/core';
import {DateUtilService} from '../date-util.service';

@Component({
  selector: 'app-timelives',
  templateUrl: './timelives.component.html',
  styleUrls: ['./timelives.component.scss']
})
export class TimelivesComponent implements OnInit {
  output: string;
  constructor(private dateUtilService: DateUtilService) { }

  ngOnInit(): void {
  }
  onChange(value){
    this.output = this.dateUtilService.getDiffToNow(value);
  }

}
