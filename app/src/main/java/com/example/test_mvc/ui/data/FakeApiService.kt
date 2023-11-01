package com.example.test_mvc.ui.data

import com.example.test_mvc.ui.data.model.Wisdom

class FakeApiService {
    private val wisdomList = listOf<Wisdom>(
        Wisdom("Don‘t be Angry", "1/4/2023"),
        Wisdom("Embrace uncertainty and find your strength within", "11/14/2022"),
        Wisdom("Embrace uncertainty and find your strength within", "11/14/2022"),
        Wisdom(
            "Forgive others, not because they deserve it, but because you deserve peace",
            "06/03/2023"
        ),
        Wisdom(
            "Success is not final; failure is not fatal. It's the courage to continue that counts",
            "09/21/2023"
        ),
        Wisdom("Happiness is found when you stop comparing yourself to others", "02/08/2023"),
        Wisdom("A journey of a thousand miles begins with a single step", "05/17/2023"),
        Wisdom("Kindness is a language that everyone can understand", "03/29/2023"),
        Wisdom(
            "Let go of what no longer serves you and make room for what inspires you",
            "08/12/2023"
        ),
        Wisdom("In the midst of chaos, find peace within yourself", "07/06/2023"),
        Wisdom("Your attitude determines your altitude", "01/22/2023"),
        Wisdom("The only way to do great work is to love what you do", "04/30/2023"),
        Wisdom("Believe in yourself, and the world will believe in you", "10/07/2022"),
        Wisdom(
            "Success is not measured by money, but by the impact you have on others",
            "12/11/2022"
        ),
        Wisdom("Take risks, for they are the seeds of opportunity", "03/05/2023"),
        Wisdom("The greatest teacher is experience", "07/24/2023"),
        Wisdom("True strength lies in vulnerability", "11/30/2022"),
        Wisdom(
            "Cherish the present, for it is the only moment you have control over",
            "06/19/2023"
        ),
        Wisdom("The best way to predict the future is to create it", "02/27/2023"),
        Wisdom("Gratitude turns what we have into enough", "09/08/2023"),
        Wisdom("Success is not about the destination, but the journey", "05/02/2023"),
        Wisdom("Let your actions speak louder than your words", "01/16/2023"),
        Wisdom("The greatest battles are fought within yourself", "04/10/2023"),
        Wisdom("Find joy in the little things, for they make life meaningful", "08/28/2023"),
        Wisdom("The best investment you can make is in yourself", "03/12/2023"),
        Wisdom("Simplicity is the ultimate sophistication", "10/28/2022"),
        Wisdom("In times of adversity, remember that this too shall pass", "12/24/2022")
    )


    fun getRandomWisdom(): Wisdom {
        val random = (Math.random() * wisdomList.size).toInt()
        return wisdomList[random]
    }
}