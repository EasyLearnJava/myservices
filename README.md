# myservices
Test Proj

<b>NOTE: All the below notes is from Angular 2 documentation </b>

Angular JS 2 Notes:

1) Every Angular application has at least one module: the root module, named AppModule here. This is the entry point to your application. Declare here which components, directives and pipes belong to the module. Make some of those classes public so that other component templates can use them. Import other modules with the components, directives and pipes needed by the components in this module. Provide services at the application level that any application component can use.
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

6) Lets look at two way data binding example now. To achieve two way data binding make sure that we import the FormsModule in the AppModule file
```
<input [(ngModel)]="hero.name" placeholder="name">
```


Angular terminology:
1) Dynamic bootstrapping with the Just-in-time (JiT) compiler
```
// The browser platform with a compiler
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

// The app module
import { AppModule } from './app.module';

// Compile and launch the module
platformBrowserDynamic().bootstrapModule(AppModule);
```

2) Static bootstrapping with the Ahead-Of-time (AoT) compiler
```
// The browser platform without a compiler
import { platformBrowser } from '@angular/platform-browser';

// The app module factory produced by the static offline compiler
import { AppModuleNgFactory } from './app.module.ngfactory';

// Launch with the app module factory.
platformBrowser().bootstrapModuleFactory(AppModuleNgFactory);
```


