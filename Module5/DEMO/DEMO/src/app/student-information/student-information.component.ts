import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from '../model/IStudent';

@Component({// cac thanh phan duoc danh dau @ duoc goi la decorator tuong duong voi anotation trong spring
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
 })

// component con
export class StudentInformationComponent implements OnInit{
  @Input()
  childStudentDetail: IStudent;

  @Output()
  // Khai bao mot su kien
  throwCurrentMark = new EventEmitter();
  constructor() {
  }
  ngOnInit(): void {
  }

  changeMarkForStudent(mark: number){
    this.childStudentDetail.mark = mark;
    this.throwCurrentMark.emit(mark);
  }
}

