Feature: SberBankTest

  Scenario: receiving a card

    Given client opens any https://www.sberbank.ru/ site
    When client selects cards in main menu
    And client selects debit_cards in cards menu
    And client selects sber_card card