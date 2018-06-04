from pysimplesoap.client import SoapClient

client = SoapClient(wsdl='http://localhost:8080/ws/diploma.wsdl', trace=False)

soap_key = input('Please enter token: ')


def format_competitor(competitor):
    return f'COMPETITOR:\n  + ID: {competitor["id"]}\n  + name: {competitor["name"]}\n  + personal code:' \
           f' {competitor["personalCode"]}'


while True:
    operation = input(
        'Available operations:\n1: List all competitors\n' +
        '2: Add new competitor\n0: Exit\nPlease enter the number of operation: ')
    if operation == '1':
        competitors = client.findAllCompetitors(
            token=soap_key
        )
        print('\nCompetitors:\n')
        for competitor in competitors['competitor']:
            print(format_competitor(competitor))
        print('\n\n')
    elif operation == '2':
        name = input('Enter name: ')
        personal_code = input('Enter personal code: ')
        competitor = client.addCompetitor(
            token=soap_key,
            name=name,
            personalCode=personal_code
        )
        print('Saved!')
        print(format_competitor(competitor['competitor']))
        print('\n\n')
    elif operation == '0':
        exit(0)
    else:
        print('Unknown operation!\n\n')
