import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorCreateFlightsComponent } from './vendor-create-flights.component';

describe('VendorCreateFlightsComponent', () => {
  let component: VendorCreateFlightsComponent;
  let fixture: ComponentFixture<VendorCreateFlightsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendorCreateFlightsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendorCreateFlightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
