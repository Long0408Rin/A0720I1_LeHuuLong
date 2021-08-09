import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimelivesComponent } from './timelives.component';

describe('TimelivesComponent', () => {
  let component: TimelivesComponent;
  let fixture: ComponentFixture<TimelivesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimelivesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimelivesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
