class EmployeeSalary:

    hourly_payment = 400
   
    def __init__(self, name, hours=None, rest_days=0, email=None):
        self.name = name
        self.hours = hours
        self.rest_days = rest_days
        self.email = email
       
    @classmethod
    def get_hours(cls, name, hours, rest_days, email):
        return cls(name, hours, rest_days, email)

    @classmethod
    def get_email(cls, name, hours, rest_days, email):
        return cls(name, hours, rest_days, email)

    @classmethod
    def set_hourly_payment(cls, new_hourly_payment):
        cls.hourly_payment = new_hourly_payment

    def salary(self):
        if self.hours is not None:
            actual_hours = self.hours
        else:
            if not 0 <= self.rest_days <= 7:
                raise ValueError("rest_days должно быть от 0 до 7")
            actual_hours = (7 - self.rest_days) * 8
        return actual_hours * self.hourly_payment
    
