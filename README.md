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
  selector: 'my-app'
  template: '<h1>My First Angular App</h1>'
})
export class AppComponent { }
```

3) Create a class and can assign properties
```
export class Hero{
id: number;
name: string;
}
```

4) Create an object(like what we do in java) for the Hero class created above, in a different class. In the below example var1 property stores a string type data and myhero property is of type Hero
```
export class AppContext{
 var1 = 'dummy data';
 myhero: Hero = {
    id: 1,
    name: 'Windstorm'
  };
}
```

5) Accessing the above AppContext class properties in a template. The double curly braces tell our app to read the title and hero properties from the component and render them. This is the "interpolation" form of one-way data binding.
```
<h1> This is {{var1}} and now the hero id is {{myhero.id}} and name is {{myhero.name}}
```

