import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SizeEditorComponent } from './size-editor.component';

describe('SizeEditorComponent', () => {
  let component: SizeEditorComponent;
  let fixture: ComponentFixture<SizeEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SizeEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SizeEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
