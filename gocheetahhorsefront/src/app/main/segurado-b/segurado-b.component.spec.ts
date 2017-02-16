/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { SeguradoBComponent } from './segurado-b.component';

describe('SeguradoBComponent', () => {
  let component: SeguradoBComponent;
  let fixture: ComponentFixture<SeguradoBComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SeguradoBComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeguradoBComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
