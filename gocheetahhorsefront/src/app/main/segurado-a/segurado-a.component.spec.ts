/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { SeguradoAComponent } from './segurado-a.component';

describe('SeguradoAComponent', () => {
  let component: SeguradoAComponent;
  let fixture: ComponentFixture<SeguradoAComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SeguradoAComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeguradoAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
