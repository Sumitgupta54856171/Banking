import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { FormsModule } from '@angular/forms';
import { importProvidersFrom } from '@angular/core';
import { provideRouter } from '@angular/router';
import { routes } from './app/app.routes';

bootstrapApplication(App,  {
  ...appConfig,
  providers: [
    ...appConfig.providers || [],
    importProvidersFrom(FormsModule), // ✅ Add FormsModule correctly here
    provideRouter(routes)
  ]
})
  .catch((err) => console.error(err));
