import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Offere } from './offere';

describe('Offere', () => {
  let component: Offere;
  let fixture: ComponentFixture<Offere>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Offere]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Offere);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
