import {Component, OnInit} from '@angular/core';
import {IStudent} from '../model/IStudent';
import {studentDao} from '../repository/studentDao';

// Component cha
@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})

export class StudentListComponent implements OnInit{
  students: IStudent[] = studentDao;
  parentStudentDetail: IStudent;

  constructor() {
  }

  ngOnInit(): void {
  }

  getStudent(value){
    this.parentStudentDetail = value;
    console.log(this.parentStudentDetail);
  }
  catchMarkFromChildrent(value){
    console.log('gia tri nhan duoc tai component cha: ' + value);
  }
}
