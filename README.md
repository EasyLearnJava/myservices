# myservices
Test Proj

Angular JS 2 Notes:

1) Every Angular application has at least one module: the root module, named AppModule here. This is the entry point to your application.
```
import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

@NgModule({
  imports:      [ BrowserModule ]
})
export class AppModule { }
```


2) Every Angular application has at least one component: the root component, named AppComponent here. Components are the basic building blocks of Angular applications. A component controls a portion of the screen—a view—through its associated template.
```
import { Component } from '@angular/core';
@Component({
  selector: 'my-app',
  template: '<h1>My First Angular App</h1>'
})
export class AppComponent { }
```

