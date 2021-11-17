import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorflightviewComponent } from './vendorflightview.component';

describe('VendorflightviewComponent', () => {
  let component: VendorflightviewComponent;
  let fixture: ComponentFixture<VendorflightviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendorflightviewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendorflightviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
