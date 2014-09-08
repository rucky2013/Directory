Directory Web Module
=========

The Directory web module was created using the Yo Angular generator.

## Installation Steps
Install `yo`:
```
npm install -g yo
```

Install `generator-angular`:
```
npm install -g generator-angular
```

Make a new directory, and `cd` into it:
```
mkdir my-new-project && cd $_
```

Run `yo angular`, optionally passing an app name:
```
yo angular [app-name]
```

### Installation Gotchas
I had to install a couple of items due to errors the first time I ran a clean and test.

Install the chalk library:
```
npm install chalk --save-dev
```
Install the grunt-karma library:
```
npm install grunt-karma --save-dev
```

Install the karma phantomjs library:
```
npm install karma-phantomjs-launcher --save-dev
```


