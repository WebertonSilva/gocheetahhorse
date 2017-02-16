/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { CorretorComponent } from './corretor.component';

describe('CorretorComponent', () => {
  let component: CorretorComponent;
  let fixture: ComponentFixture<CorretorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CorretorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CorretorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
