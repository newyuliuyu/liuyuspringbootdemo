(function () {
    "use strict";
    var models = ['jquery',
        'vue',
        'pin',
        'bootstrap',
        'css!style/pin',
        'css!style/bootstrap/bootstrap.min',
        'css!style/public'
    ];
    define(models, function ($, Vue) {

        function init() {
        }

        return {
            render: function () {
                $('body').show();
                init();
            }
        }
    });
})();