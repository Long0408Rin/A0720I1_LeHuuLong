import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms';
import {ITodo} from '../todoModel/ITodo';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit {
  userInput = new FormControl();
  todos: Array<ITodo> = [];
  // tslint:disable-next-line:variable-name
  _id = 1;
  constructor() { }

  ngOnInit(): void {
  }
  onChange() {
    const {value} = this.userInput;
    if (value) {
      const todo: ITodo = {
        id: this._id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.userInput.setValue('');
    }
  }

  toggleTodo(i) {
    this.todos[i].complete = !this.todos[i].complete;
  }

}
