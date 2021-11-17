import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildFindFlightsComponent } from './child-find-flights.component';

describe('ChildFindFlightsComponent', () => {
  let component: ChildFindFlightsComponent;
  let fixture: ComponentFixture<ChildFindFlightsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChildFindFlightsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildFindFlightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
