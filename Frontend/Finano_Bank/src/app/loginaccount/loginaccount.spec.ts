import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Loginaccount } from './loginaccount';

describe('Loginaccount', () => {
  let component: Loginaccount;
  let fixture: ComponentFixture<Loginaccount>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Loginaccount]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Loginaccount);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
