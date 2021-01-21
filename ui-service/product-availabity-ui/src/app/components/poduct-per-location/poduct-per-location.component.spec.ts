import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoductPerLocationComponent } from './poduct-per-location.component';

describe('PoductPerLocationComponent', () => {
  let component: PoductPerLocationComponent;
  let fixture: ComponentFixture<PoductPerLocationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoductPerLocationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoductPerLocationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
