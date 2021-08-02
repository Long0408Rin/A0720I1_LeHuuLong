import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PetInfomationComponent } from './pet-infomation.component';

describe('PetInfomationComponent', () => {
  let component: PetInfomationComponent;
  let fixture: ComponentFixture<PetInfomationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PetInfomationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PetInfomationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
