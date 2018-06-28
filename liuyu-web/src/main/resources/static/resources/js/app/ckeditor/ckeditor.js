(function () {
    "use strict";
    var models = ['jquery',
        'ckeditor',
        'bootstrap',
        'css!style/bootstrap/bootstrap.min',
        'css!style/public'
    ];
    define(models, function ($) {


        return {
            render: function () {
                console.log("test...l.......")
            }
        }
    });
})();