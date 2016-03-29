var Login_view = Backbone.View.extend({	
	
	template: _.template(login_template),
	
    render: function () {
		this.$el.html(this.template);//adding the template content to the main template.
		return this;
    },
	
	model : LoginModel,
	
	events : {
		'click #login':'handleLogin'
	},
	handleLogin : function(event){
		var username = $("#username").val();
		var password = $("#password").val();
		if(username.length > 0 && password.length > 0){
			this.model.set("username",username);
			appRouter.navigate("homePage",{trigger:true});
		}else{
			alert("please enter both user name and password");
		}
	
	}
});